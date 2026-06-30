package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser */
/* loaded from: classes4.dex */
public class C15798x5eeb90de extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: chat_user_data */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> f36807x5b66a377 = new java.util.LinkedList<>();

    /* renamed from: icon_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36808xf5e9d01d;

    /* renamed from: left_icon */
    public java.lang.String f36809x67cf41b1;

    /* renamed from: need_fold */
    public boolean f36810x40232a0a;

    /* renamed from: status */
    public long f36811xcacdcff2;

    /* renamed from: status_desc */
    public java.lang.String f36812xcada0ebe;

    /* renamed from: status_icon */
    public java.lang.String f36813xcadc4ca6;

    /* renamed from: text_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b f36814xc220a663;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64232xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de c15798x5eeb90de = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de) fVar;
        return n51.f.a(this.f36807x5b66a377, c15798x5eeb90de.f36807x5b66a377) && n51.f.a(java.lang.Long.valueOf(this.f36811xcacdcff2), java.lang.Long.valueOf(c15798x5eeb90de.f36811xcacdcff2)) && n51.f.a(this.f36813xcadc4ca6, c15798x5eeb90de.f36813xcadc4ca6) && n51.f.a(this.f36808xf5e9d01d, c15798x5eeb90de.f36808xf5e9d01d) && n51.f.a(this.f36812xcada0ebe, c15798x5eeb90de.f36812xcada0ebe) && n51.f.a(this.f36814xc220a663, c15798x5eeb90de.f36814xc220a663) && n51.f.a(java.lang.Boolean.valueOf(this.f36810x40232a0a), java.lang.Boolean.valueOf(c15798x5eeb90de.f36810x40232a0a)) && n51.f.a(this.f36809x67cf41b1, c15798x5eeb90de.f36809x67cf41b1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f36807x5b66a377);
            fVar.h(2, this.f36811xcacdcff2);
            java.lang.String str = this.f36813xcadc4ca6;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36808xf5e9d01d;
            if (c15748x3e43f43 != null) {
                fVar.i(4, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36808xf5e9d01d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f36812xcada0ebe;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b c15824xc803239b = this.f36814xc220a663;
            if (c15824xc803239b != null) {
                fVar.i(6, c15824xc803239b.mo75928xcd1e8d8());
                this.f36814xc220a663.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f36810x40232a0a);
            java.lang.String str3 = this.f36809x67cf41b1;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f36807x5b66a377) + 0 + b36.f.h(2, this.f36811xcacdcff2);
            java.lang.String str4 = this.f36813xcadc4ca6;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36808xf5e9d01d;
            if (c15748x3e43f432 != null) {
                g17 += b36.f.i(4, c15748x3e43f432.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f36812xcada0ebe;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b c15824xc803239b2 = this.f36814xc220a663;
            if (c15824xc803239b2 != null) {
                g17 += b36.f.i(6, c15824xc803239b2.mo75928xcd1e8d8());
            }
            int a17 = g17 + b36.f.a(7, this.f36810x40232a0a);
            java.lang.String str6 = this.f36809x67cf41b1;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36807x5b66a377.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de c15798x5eeb90de = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15744x2fe9df88.mo11468x92b714fd(bArr2);
                    }
                    c15798x5eeb90de.f36807x5b66a377.add(c15744x2fe9df88);
                }
                return 0;
            case 2:
                c15798x5eeb90de.f36811xcacdcff2 = aVar2.i(intValue);
                return 0;
            case 3:
                c15798x5eeb90de.f36813xcadc4ca6 = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15748x3e43f433.mo11468x92b714fd(bArr3);
                    }
                    c15798x5eeb90de.f36808xf5e9d01d = c15748x3e43f433;
                }
                return 0;
            case 5:
                c15798x5eeb90de.f36812xcada0ebe = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b c15824xc803239b3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15824xc803239b3.mo11468x92b714fd(bArr4);
                    }
                    c15798x5eeb90de.f36814xc220a663 = c15824xc803239b3;
                }
                return 0;
            case 7:
                c15798x5eeb90de.f36810x40232a0a = aVar2.c(intValue);
                return 0;
            case 8:
                c15798x5eeb90de.f36809x67cf41b1 = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setChat_user_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64233x11f4d879(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> linkedList) {
        this.f36807x5b66a377 = linkedList;
        return this;
    }

    /* renamed from: setIcon_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64234x124ed61f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36808xf5e9d01d = c15748x3e43f43;
        return this;
    }

    /* renamed from: setLeft_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64235xc390736f(java.lang.String str) {
        this.f36809x67cf41b1 = str;
        return this;
    }

    /* renamed from: setNeed_fold */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64236x9be45bc8(boolean z17) {
        this.f36810x40232a0a = z17;
        return this;
    }

    /* renamed from: setStatus */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64237x231a26f4(long j17) {
        this.f36811xcacdcff2 = j17;
        return this;
    }

    /* renamed from: setStatus_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64238x3b15c8fc(java.lang.String str) {
        this.f36812xcada0ebe = str;
        return this;
    }

    /* renamed from: setStatus_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64239x3b1806e4(java.lang.String str) {
        this.f36813xcadc4ca6 = str;
        return this;
    }

    /* renamed from: setText_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15798x5eeb90de m64240x1de1d821(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15824xc803239b c15824xc803239b) {
        this.f36814xc220a663 = c15824xc803239b;
        return this;
    }
}
