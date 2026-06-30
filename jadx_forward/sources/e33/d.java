package e33;

/* loaded from: classes10.dex */
public class d implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328727a;

    public d(e33.b0 b0Var) {
        this.f328727a = b0Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        o23.n nVar = o23.m.f423959a;
        nVar.B.set(java.lang.Boolean.TRUE);
        e33.b0 b0Var = this.f328727a;
        b0Var.B = true;
        if (b0Var.E) {
            z17 = !z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = b0Var.E(i17);
        if (E == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(E.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            b0Var.m8147xed6e4d18(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "click image path:" + E.f219963e);
            if (b0Var.f328664g.contains(E) != z17) {
                b0Var.Q(i17, E, null);
            }
        }
        nVar.B.set(java.lang.Boolean.FALSE);
        b0Var.B = false;
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return true;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        e33.b0 b0Var = this.f328727a;
        boolean contains = b0Var.f328664g.contains(b0Var.E(i17));
        return b0Var.E ? !contains : contains;
    }
}
