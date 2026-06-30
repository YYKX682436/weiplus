package w21;

/* loaded from: classes5.dex */
public class j0 implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.k0 f523931a;

    public j0(w21.k0 k0Var) {
        this.f523931a = k0Var;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        w21.k0 k0Var = this.f523931a;
        yl.h hVar = k0Var.f523954e;
        if (hVar != null) {
            hVar.a(new tl.h0(bArr, i17), 0);
        }
        k0Var.getClass();
        for (int i18 = 0; i18 < i17 / 2; i18++) {
            int i19 = i18 * 2;
            short s17 = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
            if (s17 > k0Var.f523951b) {
                k0Var.f523951b = s17;
            }
        }
        int length = bArr.length;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943 c5976xd9495943 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943();
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        am.dt dtVar = c5976xd9495943.f136273g;
        dtVar.f88032a = copyOf;
        dtVar.f88033b = i17;
        c5976xd9495943.e();
    }
}
