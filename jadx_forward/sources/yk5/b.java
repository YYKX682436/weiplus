package yk5;

/* loaded from: classes11.dex */
public class b implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk5.e f544397a;

    public b(yk5.e eVar) {
        this.f544397a = eVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f544397a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            yk5.e eVar = this.f544397a;
            if (i17 < eVar.getCount()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) eVar.getItem(i17);
                if (l4Var == null) {
                    return null;
                }
                return l4Var.h1();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SearchConversationAdapter", "pos is invalid");
        return null;
    }
}
