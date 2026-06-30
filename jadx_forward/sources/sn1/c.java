package sn1;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f491526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f491527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.i f491529g;

    public c(sn1.i iVar, int i17, int i18, java.lang.String str) {
        this.f491529g = iVar;
        this.f491526d = i17;
        this.f491527e = i18;
        this.f491528f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        java.util.Map map = sn1.i.f491545f;
        synchronized (map) {
            set = (java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(this.f491529g.mo808xfb85f7b0()));
        }
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(set);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) it.next();
            if (u0Var != null && set.contains(u0Var)) {
                u0Var.mo815x76e0bfae(this.f491526d, this.f491527e, this.f491528f, this.f491529g);
            }
        }
    }
}
