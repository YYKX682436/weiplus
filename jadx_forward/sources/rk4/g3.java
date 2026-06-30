package rk4;

/* loaded from: classes9.dex */
public final class g3 implements qk.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478206a;

    public g3(yz5.l lVar) {
        this.f478206a = lVar;
    }

    @Override // qk.b8
    public void a(int i17, java.lang.String filePath, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        bw5.yo0 yo0Var = new bw5.yo0();
        yo0Var.f117125d = i17;
        boolean[] zArr = yo0Var.f117130i;
        zArr[1] = true;
        yo0Var.f117126e = filePath;
        zArr[2] = true;
        yo0Var.f117127f = (int) d17;
        zArr[3] = true;
        this.f478206a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(yo0Var.mo14344x5f01b1f6())));
    }
}
