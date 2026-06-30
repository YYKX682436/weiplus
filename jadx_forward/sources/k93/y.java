package k93;

/* loaded from: classes3.dex */
public class y implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.b7 f387463a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130, db5.b7 b7Var) {
        this.f387463a = b7Var;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("tag_clk_status", java.lang.Integer.valueOf(((java.lang.Integer) this.f387463a.f309829b.getTag()).intValue() == 1 ? 2 : 1));
        }
        return hashMap;
    }
}
