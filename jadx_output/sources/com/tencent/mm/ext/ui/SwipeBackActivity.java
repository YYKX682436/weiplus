package com.tencent.mm.ext.ui;

/* loaded from: classes14.dex */
public class SwipeBackActivity extends com.tencent.mm.ui.component.UIComponentActivity implements es.i, es.m {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ext.ui.SwipeBackLayout f64958d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f64959e = null;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = this.f64958d;
        if (keyEvent.getKeyCode() == 4 && swipeBackLayout != null) {
            if (swipeBackLayout.f64976w && java.lang.Float.compare(swipeBackLayout.f64966m.getLeft(), 0.01f) <= 0) {
                swipeBackLayout.f64976w = false;
            }
            if (swipeBackLayout.f64976w) {
                kd.c.e("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event", new java.lang.Object[0]);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return java.util.Collections.emptySet();
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            return;
        }
        java.util.LinkedList linkedList = es.k.f256269b;
        kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "pushCallback size %d, %s", java.lang.Integer.valueOf(linkedList.size()), this);
        linkedList.add(0, new java.lang.ref.WeakReference(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.LinkedList linkedList = es.k.f256269b;
        int size = linkedList.size();
        kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "popCallback size %d, %s", java.lang.Integer.valueOf(size), this);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            if (i17 >= linkedList.size()) {
                break;
            }
            if (this == ((java.lang.ref.WeakReference) linkedList.get(i17)).get()) {
                linkedList.remove(i17);
                kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "popCallback directly, index %d", java.lang.Integer.valueOf(i17));
                break;
            } else {
                linkedList2.add(0, java.lang.Integer.valueOf(i17));
                i17++;
            }
        }
        if (linkedList2.size() == size) {
            kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "popCallback Fail! Maybe Top Activity", new java.lang.Object[0]);
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) linkedList.remove(((java.lang.Integer) it.next()).intValue());
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = weakReference != null ? weakReference.get() : "NULL-CALLBACK";
                kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "popCallback, popup %s", objArr);
            }
            linkedList2.isEmpty();
        }
        onSwipe(1.0f);
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = this.f64958d;
        if (swipeBackLayout != null) {
            swipeBackLayout.f64976w = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void onSwipe(float f17) {
        if (this.f64959e == null) {
            this.f64959e = es.u.a(getWindow(), getSupportActionBar() != null ? getSupportActionBar().j() : null);
        }
        android.view.View view = this.f64959e;
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            es.g.b(view, 0.0f, 0.0f);
        } else {
            es.g.b(view, (view.getWidth() / 3.5f) * (1.0f - f17) * (-1.0f), 0.0f);
        }
    }

    public void onSwipeBack() {
        if (!isFinishing()) {
            finish();
        }
        android.view.View decorView = getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
    }
}
