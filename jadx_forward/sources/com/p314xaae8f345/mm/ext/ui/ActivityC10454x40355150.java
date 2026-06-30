package com.p314xaae8f345.mm.ext.ui;

/* renamed from: com.tencent.mm.ext.ui.SwipeBackActivity */
/* loaded from: classes14.dex */
public class ActivityC10454x40355150 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 implements es.i, es.m {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ext.ui.C10455x858f5ab f146491d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f146492e = null;

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = this.f146491d;
        if (keyEvent.getKeyCode() == 4 && c10455x858f5ab != null) {
            if (c10455x858f5ab.f146509w && java.lang.Float.compare(c10455x858f5ab.f146499m.getLeft(), 0.01f) <= 0) {
                c10455x858f5ab.f146509w = false;
            }
            if (c10455x858f5ab.f146509w) {
                kd.c.e("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event", new java.lang.Object[0]);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return java.util.Collections.emptySet();
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            return;
        }
        java.util.LinkedList linkedList = es.k.f337802b;
        kd.c.a("MicroMsg.LiteAppSwipeBackHelper", "pushCallback size %d, %s", java.lang.Integer.valueOf(linkedList.size()), this);
        linkedList.add(0, new java.lang.ref.WeakReference(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.LinkedList linkedList = es.k.f337802b;
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
        m43744xb052149b(1.0f);
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = this.f146491d;
        if (c10455x858f5ab != null) {
            c10455x858f5ab.f146509w = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* renamed from: onSwipe */
    public void m43744xb052149b(float f17) {
        if (this.f146492e == null) {
            this.f146492e = es.u.a(getWindow(), mo2533x106ab264() != null ? mo2533x106ab264().j() : null);
        }
        android.view.View view = this.f146492e;
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            es.g.b(view, 0.0f, 0.0f);
        } else {
            es.g.b(view, (view.getWidth() / 3.5f) * (1.0f - f17) * (-1.0f), 0.0f);
        }
    }

    /* renamed from: onSwipeBack */
    public void m43745x59cfc822() {
        if (!isFinishing()) {
            finish();
        }
        android.view.View decorView = getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ext/ui/SwipeBackActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
    }
}
