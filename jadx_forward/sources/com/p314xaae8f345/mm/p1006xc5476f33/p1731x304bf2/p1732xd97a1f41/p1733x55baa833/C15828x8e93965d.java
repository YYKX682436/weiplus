package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo */
/* loaded from: classes4.dex */
public class C15828x8e93965d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: content_id */
    public java.lang.String f36884xfc4bea1;

    /* renamed from: content_url */
    public java.lang.String f36885xe8d344a9;

    /* renamed from: has_publish */
    public boolean f36886x26029c6a;

    /* renamed from: left_desc */
    public java.lang.String f36887x67cd03c9;

    /* renamed from: right_desc */
    public java.lang.String f36888xad42e6d4;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64342xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f36886x26029c6a), java.lang.Boolean.valueOf(c15828x8e93965d.f36886x26029c6a)) && n51.f.a(this.f36884xfc4bea1, c15828x8e93965d.f36884xfc4bea1) && n51.f.a(this.f36885xe8d344a9, c15828x8e93965d.f36885xe8d344a9) && n51.f.a(this.f36887x67cd03c9, c15828x8e93965d.f36887x67cd03c9) && n51.f.a(this.f36888xad42e6d4, c15828x8e93965d.f36888xad42e6d4);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f36886x26029c6a);
            java.lang.String str = this.f36884xfc4bea1;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36885xe8d344a9;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f36887x67cd03c9;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f36888xad42e6d4;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f36886x26029c6a) + 0;
            java.lang.String str5 = this.f36884xfc4bea1;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f36885xe8d344a9;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f36887x67cd03c9;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f36888xad42e6d4;
            return str8 != null ? a17 + b36.f.j(5, str8) : a17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15828x8e93965d.f36886x26029c6a = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15828x8e93965d.f36884xfc4bea1 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15828x8e93965d.f36885xe8d344a9 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            c15828x8e93965d.f36887x67cd03c9 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c15828x8e93965d.f36888xad42e6d4 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setContent_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64343x2c29c4a3(java.lang.String str) {
        this.f36884xfc4bea1 = str;
        return this;
    }

    /* renamed from: setContent_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64344x590efee7(java.lang.String str) {
        this.f36885xe8d344a9 = str;
        return this;
    }

    /* renamed from: setHas_publish */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64345x963e56a8(boolean z17) {
        this.f36886x26029c6a = z17;
        return this;
    }

    /* renamed from: setLeft_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64346xc38e3587(java.lang.String str) {
        this.f36887x67cd03c9 = str;
        return this;
    }

    /* renamed from: setRight_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d m64347xc9a7ecd6(java.lang.String str) {
        this.f36888xad42e6d4 = str;
        return this;
    }
}
