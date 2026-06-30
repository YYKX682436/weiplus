package k85;

/* loaded from: classes5.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f386936d;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.app.Activity activity, d85.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        this.f386933a = c0Var;
        this.f386934b = activity;
        this.f386935c = g0Var;
        this.f386936d = c0Var2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
    /* renamed from: onDismiss */
    public final void mo51018xb349b3ab() {
        java.util.LinkedList linkedList;
        if (this.f386933a.f391645d) {
            return;
        }
        k85.t tVar = k85.t.f386972a;
        java.util.HashMap hashMap = k85.t.f386973b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.app.Activity activity = this.f386934b;
        sb6.append(activity);
        sb6.append('_');
        d85.g0 g0Var = this.f386935c;
        sb6.append(g0Var.f308725d);
        jz5.l lVar = (jz5.l) hashMap.get(sb6.toString());
        if (lVar != null && (linkedList = (java.util.LinkedList) lVar.f384367e) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((yz5.l) it.next()).mo146xb9724478(java.lang.Boolean.valueOf(this.f386936d.f391645d));
            }
        }
        k85.t tVar2 = k85.t.f386972a;
        k85.t.f386973b.remove(activity + '_' + g0Var.f308725d);
    }
}
