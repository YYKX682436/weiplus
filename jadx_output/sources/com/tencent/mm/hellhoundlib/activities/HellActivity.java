package com.tencent.mm.hellhoundlib.activities;

/* loaded from: classes14.dex */
public class HellActivity extends android.app.Activity {
    private android.util.SparseArray<java.lang.Object> mHellTags;

    public void Z2() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        xj0.a.h().b(this);
        super.finish();
    }

    @Override // android.app.Activity
    public void finishActivity(int i17) {
        xj0.a.h().b(this);
        super.finishActivity(i17);
    }

    @Override // android.app.Activity
    public void finishActivityFromChild(android.app.Activity activity, int i17) {
        xj0.a.h().b(activity);
        super.finishActivityFromChild(activity, i17);
    }

    @Override // android.app.Activity
    public void finishAffinity() {
        xj0.a.h().b(this);
        super.finishAffinity();
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
        xj0.a.h().b(this);
        super.finishAndRemoveTask();
    }

    public java.lang.Object getHellTag(int i17) {
        android.util.SparseArray<java.lang.Object> sparseArray = this.mHellTags;
        if (sparseArray != null) {
            return sparseArray.get(i17);
        }
        return null;
    }

    public void m5() {
        onBackPressed();
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z17) {
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        xj0.c cVar = h17.f454774b;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, moveTaskToBack: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f268895a;
            if (hVar.f268898a != null && k95.b.a(this)) {
                g52.b bVar = (g52.b) hVar.f268898a;
                bVar.f268892c.getClass();
                r45.iq4 iq4Var = new r45.iq4();
                iq4Var.f377266d = new r45.bn6();
                iq4Var.f377268f = java.lang.System.currentTimeMillis();
                iq4Var.f377266d.f370900d = getClass().getCanonicalName();
                iq4Var.f377266d.f370901e = hashCode();
                r45.bn6 bn6Var = iq4Var.f377266d;
                long j17 = iq4Var.f377268f;
                bn6Var.f370902f = j17;
                iq4Var.f377267e = z17;
                p52.k.b(this, j17);
                java.lang.String str = iq4Var.f377266d.f370900d;
                p52.c cVar2 = p52.h.f352016a;
                d52.d.a().d(102, iq4Var);
                v52.c.g().a(this, 2);
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f268890a).iterator();
                while (it.hasNext()) {
                    ((e42.j0) it.next()).H(this);
                }
            }
            if (k95.b.a(this)) {
                com.tencent.mm.autogen.events.OnMoveTaskToBackEvent onMoveTaskToBackEvent = new com.tencent.mm.autogen.events.OnMoveTaskToBackEvent();
                am.zm zmVar = onMoveTaskToBackEvent.f54580g;
                zmVar.f8591a = this;
                zmVar.f8592b = z17;
                zmVar.f8593c = java.lang.System.currentTimeMillis();
                onMoveTaskToBackEvent.e();
            }
        }
        return super.moveTaskToBack(z17);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        xj0.a.h().a(this, 0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        xj0.a.h().a(this, 5);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        xj0.c cVar;
        super.onNewIntent(intent);
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (xj0.b.a(this) && (cVar = h17.f454774b) != null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onNewIntent: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f268895a;
            if (hVar.f268898a != null && k95.b.a(this)) {
                g52.b bVar = (g52.b) hVar.f268898a;
                d52.d.a().d(201, bVar.f268892c.a(intent, this));
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f268890a).iterator();
                while (it.hasNext()) {
                    ((e42.j0) it.next()).g(intent, this);
                }
            }
            if (k95.b.a(this)) {
                com.tencent.mm.autogen.events.OnActivityNewIntentEvent onActivityNewIntentEvent = new com.tencent.mm.autogen.events.OnActivityNewIntentEvent();
                am.jm jmVar = onActivityNewIntentEvent.f54564g;
                jmVar.f7049a = this;
                jmVar.f7050b = intent;
                jmVar.f7051c = java.lang.System.currentTimeMillis();
                onActivityNewIntentEvent.e();
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        xj0.a.h().a(this, 3);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        xj0.a.h().a(this, 6);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        xj0.a.h().a(this, 2);
    }

    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        finish();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        xj0.a.h().a(this, 4);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        xj0.a.h().a(this, 7);
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        xj0.c cVar = h17.f454774b;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onWindowFocusChanged: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f268895a;
            if (hVar.f268898a != null && k95.b.a(this)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) ((g52.b) hVar.f268898a).f268890a).iterator();
                while (it.hasNext()) {
                    ((e42.j0) it.next()).z(this, z17);
                }
            }
        }
        super.onWindowFocusChanged(z17);
    }

    public void pop() {
        finish();
    }

    public void setHellTag(int i17, java.lang.Object obj) {
        if (this.mHellTags == null) {
            this.mHellTags = new android.util.SparseArray<>(2);
        }
        this.mHellTags.put(i17, obj);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        xj0.c cVar;
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (xj0.b.a(this) && (cVar = h17.f454774b) != null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivities: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f268895a;
            if (hVar.f268898a != null && k95.b.a(this) && intentArr != null && intentArr.length > 0) {
                ((g52.b) hVar.f268898a).a(this, intentArr[0]);
            }
            if (intentArr != null && intentArr.length > 0) {
                g52.h.a(hVar, this, intentArr[0]);
            }
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        xj0.a.h().g(this, intent);
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // android.app.Activity
    public void startActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        xj0.a.h().g(this, intent);
        super.startActivityFromFragment(fragment, intent, i17, bundle);
    }

    @Override // android.app.Activity
    public boolean startActivityIfNeeded(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        xj0.a.h().g(this, intent);
        return super.startActivityIfNeeded(intent, i17, bundle);
    }
}
