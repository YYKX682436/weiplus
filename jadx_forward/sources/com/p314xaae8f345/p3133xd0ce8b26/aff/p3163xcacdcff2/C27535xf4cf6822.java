package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusHistory */
/* loaded from: classes2.dex */
public class C27535xf4cf6822 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 f60512xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822();

    /* renamed from: text_status_id */
    public java.lang.String f60518xb0f3aff6 = "";

    /* renamed from: topic_id */
    public java.lang.String f60519xc6f0e22b = "";

    /* renamed from: ext_info */
    public java.lang.String f60515x9320c00c = "";

    /* renamed from: liked_count */
    public int f60516x48bec1fd = 0;

    /* renamed from: create_time */
    public int f60514xe294a830 = 0;

    /* renamed from: referenced_count */
    public int f60517xc57adfc9 = 0;
    public long key = 0;

    /* renamed from: comment_count */
    public int f60513xbd2f1f2f = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117339xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117340x7c90cfc0() {
        return f60512xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117341x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117342x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 c27535xf4cf6822 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822) fVar;
        return n51.f.a(this.f60518xb0f3aff6, c27535xf4cf6822.f60518xb0f3aff6) && n51.f.a(this.f60519xc6f0e22b, c27535xf4cf6822.f60519xc6f0e22b) && n51.f.a(this.f60515x9320c00c, c27535xf4cf6822.f60515x9320c00c) && n51.f.a(java.lang.Integer.valueOf(this.f60516x48bec1fd), java.lang.Integer.valueOf(c27535xf4cf6822.f60516x48bec1fd)) && n51.f.a(java.lang.Integer.valueOf(this.f60514xe294a830), java.lang.Integer.valueOf(c27535xf4cf6822.f60514xe294a830)) && n51.f.a(java.lang.Integer.valueOf(this.f60517xc57adfc9), java.lang.Integer.valueOf(c27535xf4cf6822.f60517xc57adfc9)) && n51.f.a(java.lang.Long.valueOf(this.key), java.lang.Long.valueOf(c27535xf4cf6822.key)) && n51.f.a(java.lang.Integer.valueOf(this.f60513xbd2f1f2f), java.lang.Integer.valueOf(c27535xf4cf6822.f60513xbd2f1f2f));
    }

    /* renamed from: getCommentCount */
    public int m117343x8ed22866() {
        return this.f60513xbd2f1f2f;
    }

    /* renamed from: getComment_count */
    public int m117344x7a8edb79() {
        return this.f60513xbd2f1f2f;
    }

    /* renamed from: getCreateTime */
    public int m117345x3fdd41df() {
        return this.f60514xe294a830;
    }

    /* renamed from: getCreate_time */
    public int m117346xbc6aeefa() {
        return this.f60514xe294a830;
    }

    /* renamed from: getExtInfo */
    public java.lang.String m117347xefeda639() {
        return this.f60515x9320c00c;
    }

    /* renamed from: getExt_info */
    public java.lang.String m117348xefafd82() {
        return this.f60515x9320c00c;
    }

    /* renamed from: getKey */
    public long m117349xb5884f29() {
        return this.key;
    }

    /* renamed from: getLikedCount */
    public int m117350xc5ca1958() {
        return this.f60516x48bec1fd;
    }

    /* renamed from: getLiked_count */
    public int m117351x229508c7() {
        return this.f60516x48bec1fd;
    }

    /* renamed from: getReferencedCount */
    public int m117352x338e2be0() {
        return this.f60517xc57adfc9;
    }

    /* renamed from: getReferenced_count */
    public int m117353x6d53473f() {
        return this.f60517xc57adfc9;
    }

    /* renamed from: getTextStatusId */
    public java.lang.String m117354x9f8f6370() {
        return this.f60518xb0f3aff6;
    }

    /* renamed from: getText_status_id */
    public java.lang.String m117355x9f8b7cec() {
        return this.f60518xb0f3aff6;
    }

    /* renamed from: getTopicId */
    public java.lang.String m117356xf9e58274() {
        return this.f60519xc6f0e22b;
    }

    /* renamed from: getTopic_id */
    public java.lang.String m117357x42cb1fa1() {
        return this.f60519xc6f0e22b;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117358x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60518xb0f3aff6;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f60519xc6f0e22b;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f60515x9320c00c;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f60516x48bec1fd);
            fVar.e(5, this.f60514xe294a830);
            fVar.e(6, this.f60517xc57adfc9);
            fVar.h(7, this.key);
            fVar.e(8, this.f60513xbd2f1f2f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f60518xb0f3aff6;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f60519xc6f0e22b;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f60515x9320c00c;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f60516x48bec1fd) + b36.f.e(5, this.f60514xe294a830) + b36.f.e(6, this.f60517xc57adfc9) + b36.f.h(7, this.key) + b36.f.e(8, this.f60513xbd2f1f2f);
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
        switch (intValue) {
            case 1:
                this.f60518xb0f3aff6 = aVar2.k(intValue);
                return 0;
            case 2:
                this.f60519xc6f0e22b = aVar2.k(intValue);
                return 0;
            case 3:
                this.f60515x9320c00c = aVar2.k(intValue);
                return 0;
            case 4:
                this.f60516x48bec1fd = aVar2.g(intValue);
                return 0;
            case 5:
                this.f60514xe294a830 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f60517xc57adfc9 = aVar2.g(intValue);
                return 0;
            case 7:
                this.key = aVar2.i(intValue);
                return 0;
            case 8:
                this.f60513xbd2f1f2f = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCommentCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117360xc51b2372(int i17) {
        this.f60513xbd2f1f2f = i17;
        return this;
    }

    /* renamed from: setComment_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117361xd6541ed(int i17) {
        this.f60513xbd2f1f2f = i17;
        return this;
    }

    /* renamed from: setCreateTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117362x6e018feb(int i17) {
        this.f60514xe294a830 = i17;
        return this;
    }

    /* renamed from: setCreate_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117363x52d0626e(int i17) {
        this.f60514xe294a830 = i17;
        return this;
    }

    /* renamed from: setExtInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117364x635ef3ad(java.lang.String str) {
        this.f60515x9320c00c = str;
        return this;
    }

    /* renamed from: setExt_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117365x9b35e8e(java.lang.String str) {
        this.f60515x9320c00c = str;
        return this;
    }

    /* renamed from: setKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117366xca02769d(long j17) {
        this.key = j17;
        return this;
    }

    /* renamed from: setLikedCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117367xf3ee6764(int i17) {
        this.f60516x48bec1fd = i17;
        return this;
    }

    /* renamed from: setLiked_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117368xb8fa7c3b(int i17) {
        this.f60516x48bec1fd = i17;
        return this;
    }

    /* renamed from: setReferencedCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117369x6a64c554(int i17) {
        this.f60517xc57adfc9 = i17;
        return this;
    }

    /* renamed from: setReferenced_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117370x114fdc4b(int i17) {
        this.f60517xc57adfc9 = i17;
        return this;
    }

    /* renamed from: setTextStatusId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117371xd5d85e7c(java.lang.String str) {
        this.f60518xb0f3aff6 = str;
        return this;
    }

    /* renamed from: setText_status_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117372x6781e4f8(java.lang.String str) {
        this.f60518xb0f3aff6 = str;
        return this;
    }

    /* renamed from: setTopicId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117373x6d56cfe8(java.lang.String str) {
        this.f60519xc6f0e22b = str;
        return this;
    }

    /* renamed from: setTopic_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117374x3d8380ad(java.lang.String str) {
        this.f60519xc6f0e22b = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 m117359x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822) super.mo11468x92b714fd(bArr);
    }
}
