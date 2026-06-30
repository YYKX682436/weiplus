package cw5;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final cw5.e f305880i = new cw5.e();

    /* renamed from: d, reason: collision with root package name */
    public long f305881d;

    /* renamed from: e, reason: collision with root package name */
    public gw5.a f305882e;

    /* renamed from: f, reason: collision with root package name */
    public long f305883f;

    /* renamed from: g, reason: collision with root package name */
    public long f305884g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f305885h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.e)) {
            return false;
        }
        cw5.e eVar = (cw5.e) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f305881d), java.lang.Long.valueOf(eVar.f305881d)) && n51.f.a(this.f305882e, eVar.f305882e) && n51.f.a(java.lang.Long.valueOf(this.f305883f), java.lang.Long.valueOf(eVar.f305883f)) && n51.f.a(java.lang.Long.valueOf(this.f305884g), java.lang.Long.valueOf(eVar.f305884g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new cw5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        gw5.a aVar;
        boolean[] zArr = this.f305885h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f305881d);
            }
            gw5.a aVar2 = this.f305882e;
            if (aVar2 != null && zArr[2]) {
                fVar.e(2, aVar2.f357699d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f305883f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f305884g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f305881d) : 0;
            gw5.a aVar3 = this.f305882e;
            if (aVar3 != null && zArr[2]) {
                h17 += b36.f.e(2, aVar3.f357699d);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f305883f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f305884g) : h17;
        }
        if (i17 == 2) {
            c36.a aVar4 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar4); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar4)) {
                if (!super.mo75949x4476b383(aVar4, this, m75958x5767edba)) {
                    aVar4.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar5 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f305881d = aVar5.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f305883f = aVar5.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f305884g = aVar5.i(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar5.g(intValue)) {
            case 0:
                aVar = gw5.a.BOX_ACTION_UNKNOWN;
                break;
            case 1:
                aVar = gw5.a.BOX_ACTION_APP_FOREGROUND;
                break;
            case 2:
                aVar = gw5.a.BOX_ACTION_APP_BACKGROUND;
                break;
            case 3:
                aVar = gw5.a.BOX_ACTION_MAIN_TAB_EXPOSE;
                break;
            case 4:
                aVar = gw5.a.BOX_ACTION_MAIN_TAB_HIDE;
                break;
            case 5:
                aVar = gw5.a.BOX_ACTION_LOCK_SCREEN;
                break;
            case 6:
                aVar = gw5.a.BOX_ACTION_RECEIVE_NEW_MSG;
                break;
            default:
                aVar = null;
                break;
        }
        this.f305882e = aVar;
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (cw5.e) super.mo11468x92b714fd(bArr);
    }
}
