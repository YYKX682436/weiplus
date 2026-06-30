package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes4.dex */
public class f3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3 f300951d = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;

    /* renamed from: e, reason: collision with root package name */
    public int f300952e = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3 f3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3) fVar;
        return n51.f.a(this.f300951d, f3Var.f300951d) && n51.f.a(java.lang.Integer.valueOf(this.f300952e), java.lang.Integer.valueOf(f3Var.f300952e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.f3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3 e3Var;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3 e3Var2 = this.f300951d;
            if (e3Var2 != null) {
                fVar.e(1, e3Var2.f300936d);
            }
            fVar.e(2, this.f300952e);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3 e3Var3 = this.f300951d;
            return (e3Var3 != null ? 0 + b36.f.e(1, e3Var3.f300936d) : 0) + b36.f.e(2, this.f300952e);
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
            if (intValue != 2) {
                return -1;
            }
            this.f300952e = aVar2.g(intValue);
            return 0;
        }
        int g17 = aVar2.g(intValue);
        switch (g17) {
            case 1:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;
                break;
            case 2:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION;
                break;
            case 3:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
                break;
            case 4:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT;
                break;
            case 5:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE;
                break;
            case 6:
                e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW;
                break;
            default:
                switch (g17) {
                    case 99:
                        e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG;
                        break;
                    case 100:
                        e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR;
                        break;
                    case 101:
                        e3Var = com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e3.BOX_IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY;
                        break;
                    default:
                        e3Var = null;
                        break;
                }
        }
        this.f300951d = e3Var;
        return 0;
    }
}
