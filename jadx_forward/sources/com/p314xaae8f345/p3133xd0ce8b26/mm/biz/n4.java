package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class n4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4 f299914h = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4 f299915d = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;

    /* renamed from: e, reason: collision with root package name */
    public int f299916e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299917f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f299918g = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4 n4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4) fVar;
        return n51.f.a(this.f299915d, n4Var.f299915d) && n51.f.a(java.lang.Integer.valueOf(this.f299916e), java.lang.Integer.valueOf(n4Var.f299916e)) && n51.f.a(this.f299917f, n4Var.f299917f) && n51.f.a(java.lang.Long.valueOf(this.f299918g), java.lang.Long.valueOf(n4Var.f299918g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4 m4Var;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4 m4Var2 = this.f299915d;
            if (m4Var2 != null) {
                fVar.e(1, m4Var2.f299887d);
            }
            fVar.e(2, this.f299916e);
            java.lang.String str = this.f299917f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f299918g);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4 m4Var3 = this.f299915d;
            int e17 = (m4Var3 != null ? 0 + b36.f.e(1, m4Var3.f299887d) : 0) + b36.f.e(2, this.f299916e);
            java.lang.String str2 = this.f299917f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.h(4, this.f299918g);
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
                this.f299916e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.f299917f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f299918g = aVar2.i(intValue);
            return 0;
        }
        int g17 = aVar2.g(intValue);
        switch (g17) {
            case 1:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE;
                break;
            case 2:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_INTERACTION;
                break;
            case 3:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_NOTIFY;
                break;
            case 4:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_COMMENT;
                break;
            case 5:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_LIKE;
                break;
            case 6:
                m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FOLLOW;
                break;
            default:
                switch (g17) {
                    case 99:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_FANS_MSG;
                        break;
                    case 100:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CREATOR;
                        break;
                    case 101:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_CONSUMER_NOTIFY;
                        break;
                    case 102:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_WORKS_ENTRY;
                        break;
                    case 103:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_PROFILE;
                        break;
                    case 104:
                        m4Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_GREET_MSG;
                        break;
                    default:
                        m4Var = null;
                        break;
                }
        }
        this.f299915d = m4Var;
        return 0;
    }
}
