package bw5;

/* loaded from: classes11.dex */
public class q0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.q0 f113408i = new bw5.q0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.bj0 f113409d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113411f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113412g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113413h = new boolean[5];

    public bw5.bj0 b() {
        return this.f113413h[1] ? this.f113409d : bw5.bj0.NOTIFY_CODE_NONE;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.q0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q0)) {
            return false;
        }
        bw5.q0 q0Var = (bw5.q0) fVar;
        return n51.f.a(this.f113409d, q0Var.f113409d) && n51.f.a(this.f113410e, q0Var.f113410e) && n51.f.a(java.lang.Boolean.valueOf(this.f113411f), java.lang.Boolean.valueOf(q0Var.f113411f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113412g), java.lang.Boolean.valueOf(q0Var.f113412g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.bj0 bj0Var;
        int i18 = 0;
        boolean[] zArr = this.f113413h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bj0 bj0Var2 = this.f113409d;
            if (bj0Var2 != null && zArr[1]) {
                fVar.e(1, bj0Var2.f107246d);
            }
            java.lang.String str = this.f113410e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113411f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113412g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bj0 bj0Var3 = this.f113409d;
            if (bj0Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bj0Var3.f107246d);
            }
            java.lang.String str2 = this.f113410e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f113411f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f113412g) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                this.f113410e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f113411f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f113412g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                bj0Var = bw5.bj0.NOTIFY_CODE_NONE;
                break;
            case 1:
                bj0Var = bw5.bj0.NOTIFY_CODE_PREPARE_DONE;
                break;
            case 2:
                bj0Var = bw5.bj0.NOTIFY_CODE_START;
                break;
            case 3:
                bj0Var = bw5.bj0.NOTIFY_CODE_PAUSE;
                break;
            case 4:
                bj0Var = bw5.bj0.NOTIFY_CODE_FINISH;
                break;
            case 5:
                bj0Var = bw5.bj0.NOTIFY_CODE_CANCEL;
                break;
            case 6:
                bj0Var = bw5.bj0.NOTIFY_CODE_ERROR;
                break;
            case 7:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_PREPARING;
                break;
            case 8:
                bj0Var = bw5.bj0.NOTIFY_CODE_CONV_DONE;
                break;
            case 9:
                bj0Var = bw5.bj0.NOTIFY_CODE_IMPORTING;
                break;
            case 10:
                bj0Var = bw5.bj0.NOTIFY_CODE_CHOOSE_IS_QUICK;
                break;
            case 11:
                bj0Var = bw5.bj0.NOTIFY_CODE_WAIT_CHOOSE_SESSION;
                break;
            case 12:
                bj0Var = bw5.bj0.NOTIFY_CODE_CHOOSE_SESSION;
                break;
            case 13:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_SHOW_QRCODE;
                break;
            case 14:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_IMMIGRATION_GUIDE;
                break;
            case 15:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_WAIT_PC_RESP;
                break;
            case 16:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_READY;
                break;
            case 17:
                bj0Var = bw5.bj0.NOTIFY_CODE_UI_DIRECT_CONNECT_GUIDE;
                break;
            case 18:
                bj0Var = bw5.bj0.NOTIFY_CODE_ON_PIPELINE_UPDATED;
                break;
            default:
                bj0Var = null;
                break;
        }
        this.f113409d = bj0Var;
        zArr[1] = true;
        return 0;
    }
}
