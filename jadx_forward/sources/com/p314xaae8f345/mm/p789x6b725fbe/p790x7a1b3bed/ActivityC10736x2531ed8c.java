package com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed;

/* renamed from: com.tencent.mm.hellhoundlib.activities.HellActivity */
/* loaded from: classes14.dex */
public class ActivityC10736x2531ed8c extends android.app.Activity {

    /* renamed from: mHellTags */
    private android.util.SparseArray<java.lang.Object> f29249xf5b23883;

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

    /* renamed from: getHellTag */
    public java.lang.Object m46164x6dd30ee7(int i17) {
        android.util.SparseArray<java.lang.Object> sparseArray = this.f29249xf5b23883;
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
        xj0.c cVar = h17.f536307b;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, moveTaskToBack: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f350428a;
            if (hVar.f350431a != null && k95.b.a(this)) {
                g52.b bVar = (g52.b) hVar.f350431a;
                bVar.f350425c.getClass();
                r45.iq4 iq4Var = new r45.iq4();
                iq4Var.f458799d = new r45.bn6();
                iq4Var.f458801f = java.lang.System.currentTimeMillis();
                iq4Var.f458799d.f452433d = getClass().getCanonicalName();
                iq4Var.f458799d.f452434e = hashCode();
                r45.bn6 bn6Var = iq4Var.f458799d;
                long j17 = iq4Var.f458801f;
                bn6Var.f452435f = j17;
                iq4Var.f458800e = z17;
                p52.k.b(this, j17);
                java.lang.String str = iq4Var.f458799d.f452433d;
                p52.c cVar2 = p52.h.f433549a;
                d52.d.a().d(102, iq4Var);
                v52.c.g().a(this, 2);
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f350423a).iterator();
                while (it.hasNext()) {
                    ((e42.j0) it.next()).H(this);
                }
            }
            if (k95.b.a(this)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5804xa8b7c663 c5804xa8b7c663 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5804xa8b7c663();
                am.zm zmVar = c5804xa8b7c663.f136113g;
                zmVar.f90124a = this;
                zmVar.f90125b = z17;
                zmVar.f90126c = java.lang.System.currentTimeMillis();
                c5804xa8b7c663.e();
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
        if (xj0.b.a(this) && (cVar = h17.f536307b) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onNewIntent: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f350428a;
            if (hVar.f350431a != null && k95.b.a(this)) {
                g52.b bVar = (g52.b) hVar.f350431a;
                d52.d.a().d(201, bVar.f350425c.a(intent, this));
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f350423a).iterator();
                while (it.hasNext()) {
                    ((e42.j0) it.next()).g(intent, this);
                }
            }
            if (k95.b.a(this)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5786xf8301d6c c5786xf8301d6c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5786xf8301d6c();
                am.jm jmVar = c5786xf8301d6c.f136097g;
                jmVar.f88582a = this;
                jmVar.f88583b = intent;
                jmVar.f88584c = java.lang.System.currentTimeMillis();
                c5786xf8301d6c.e();
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

    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
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
        xj0.c cVar = h17.f536307b;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onWindowFocusChanged: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f350428a;
            if (hVar.f350431a != null && k95.b.a(this)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) ((g52.b) hVar.f350431a).f350423a).iterator();
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

    /* renamed from: setHellTag */
    public void m46165xe1445c5b(int i17, java.lang.Object obj) {
        if (this.f29249xf5b23883 == null) {
            this.f29249xf5b23883 = new android.util.SparseArray<>(2);
        }
        this.f29249xf5b23883.put(i17, obj);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        xj0.c cVar;
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (xj0.b.a(this) && (cVar = h17.f536307b) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivities: %s, %d", getClass().getName(), java.lang.Integer.valueOf(hashCode()));
            g52.h hVar = ((g52.e) cVar).f350428a;
            if (hVar.f350431a != null && k95.b.a(this) && intentArr != null && intentArr.length > 0) {
                ((g52.b) hVar.f350431a).a(this, intentArr[0]);
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
