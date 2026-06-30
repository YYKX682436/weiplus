package ef0;

/* loaded from: classes8.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f333878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(ef0.z3 z3Var) {
        super(0);
        this.f333878d = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        ef0.z3 z3Var = this.f333878d;
        for (java.lang.String path : (java.util.ArrayList) ((jz5.n) z3Var.f333912d).mo141623x754a37bb()) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            int hashCode = path.hashCode();
            if (hashCode == -1947195044) {
                if (path.equals("Listen.Music.Bubble")) {
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.M0;
                }
                j0Var = null;
            } else if (hashCode != -215995941) {
                if (hashCode == 1206099673 && path.equals("Listen.CircleX.Bubble")) {
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.O0;
                }
                j0Var = null;
            } else {
                if (path.equals("Listen.NonMusic.Bubble")) {
                    j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.N0;
                }
                j0Var = null;
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = j0Var != null ? j0Var : null;
            if (j0Var2 != null) {
                ef0.s3 s3Var = new ef0.s3(z3Var);
                j0Var2.mo7807xc74540ab(s3Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) j0Var2.mo3195x754a37bb();
                if (aVar != null) {
                    s3Var.mo525x7bb163d5(aVar);
                }
            }
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        ef0.t3 t3Var = new ef0.t3(z3Var);
        ((c61.t8) caVar).getClass();
        p012xc85e97e9.p093xedfae76a.j0 j0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.L0;
        j0Var3.mo7807xc74540ab(t3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) j0Var3.mo3195x754a37bb();
        if (z9Var != null) {
            t3Var.mo525x7bb163d5(z9Var);
        }
        ef0.u3 u3Var = new ef0.u3(z3Var);
        p012xc85e97e9.p093xedfae76a.j0 j0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.P0;
        j0Var4.mo7807xc74540ab(u3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) j0Var4.mo3195x754a37bb();
        if (z9Var2 != null) {
            u3Var.mo525x7bb163d5(z9Var2);
        }
        return jz5.f0.f384359a;
    }
}
