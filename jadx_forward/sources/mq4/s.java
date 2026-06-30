package mq4;

/* loaded from: classes12.dex */
public class s extends mq4.e0 {
    public s(int i17, long j17, int i18, int i19, int i27, int[] iArr, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i37();
        lVar.f152198b = new r45.j37();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipRedirect";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.f34121x366c91de;
        lVar.f152201e = 240;
        lVar.f152202f = 1000000240;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.i37 i37Var = (r45.i37) a17.f152243a.f152217a;
        i37Var.f458237d = i17;
        i37Var.f458238e = j17;
        i37Var.f458239f = i18;
        i37Var.f458240g = i19;
        i37Var.f458241h = i27;
        i37Var.f458248r = java.lang.System.currentTimeMillis();
        int i28 = 0;
        int i29 = 0;
        while (i28 < i27) {
            r45.l37 l37Var = new r45.l37();
            int i37 = i29 + 1;
            l37Var.f460649d = iArr[i29];
            int i38 = i37 + 1;
            l37Var.f460650e = iArr[i37];
            int i39 = i38 + 1;
            l37Var.f460651f = iArr[i38];
            int i47 = i39 + 1;
            l37Var.f460652g = iArr[i39];
            l37Var.f460653h = iArr[i47];
            i37Var.f458242i.add(l37Var);
            i28++;
            i29 = i47 + 1;
        }
        i37Var.f458243m = this.f412329g.f258065x.M1.B != 0 ? (int) ((java.lang.System.currentTimeMillis() - this.f412329g.f258065x.M1.B) / 1000) : 0;
        if (linkedList != null) {
            i37Var.f458244n = linkedList.size();
            i37Var.f458245o = linkedList;
        }
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.Redirect", "Redirect error");
            return;
        }
        r45.j37 j37Var = (r45.j37) this.f412326d.f152244b.f152233a;
        if (j37Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", java.lang.Integer.valueOf(j37Var.f459078d), java.lang.Long.valueOf(j37Var.f459083i), java.lang.Integer.valueOf(j37Var.f459084m));
        }
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.r(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.f34121x366c91de;
    }
}
