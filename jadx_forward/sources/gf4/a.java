package gf4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352863a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352865c;

    /* renamed from: d, reason: collision with root package name */
    public final long f352866d;

    /* renamed from: e, reason: collision with root package name */
    public int f352867e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352868f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f352869g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f352870h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f352871i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f352872j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f352873k;

    /* renamed from: l, reason: collision with root package name */
    public final int f352874l;

    public a() {
        this.f352863a = "";
        this.f352864b = "";
        this.f352872j = "";
        this.f352873k = "";
    }

    /* renamed from: toString */
    public java.lang.String m131441x9616526c() {
        return "StoryCommentItem(fromUser='" + this.f352863a + "', content='" + this.f352864b + "', createTime=" + this.f352865c + ", commentId=" + this.f352867e + ", isUnread=" + this.f352868f + " )";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r45.ke6 commentDetail) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentDetail, "commentDetail");
        this.f352866d = commentDetail.f460162d;
        this.f352865c = commentDetail.f460167i;
        this.f352867e = commentDetail.f460172q;
        java.lang.String str = commentDetail.f460163e;
        this.f352863a = str == null ? "" : str;
        java.lang.String str2 = commentDetail.f460168m;
        this.f352864b = str2 == null ? "" : str2;
        this.f352869g = str2 == null || str2.length() == 0;
        this.f352871i = commentDetail.f460175t == 1;
        java.lang.String str3 = commentDetail.f460164f;
        this.f352872j = str3 != null ? str3 : "";
        this.f352874l = commentDetail.f460171p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r45.le6 commentOp) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentOp, "commentOp");
        this.f352866d = commentOp.f460916d;
        java.lang.String str = commentOp.f460918f;
        this.f352863a = str == null ? "" : str;
        java.lang.String str2 = commentOp.f460920h;
        this.f352864b = str2 == null ? "" : str2;
        this.f352865c = commentOp.f460917e;
        this.f352869g = str2 == null || str2.length() == 0;
        java.lang.String str3 = commentOp.f460919g;
        this.f352872j = str3 == null ? "" : str3;
        java.lang.String str4 = commentOp.f460928s;
        this.f352873k = str4 != null ? str4 : "";
        this.f352874l = commentOp.f460929t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(gf4.a storyCommentItem) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyCommentItem, "storyCommentItem");
        this.f352863a = storyCommentItem.f352863a;
        this.f352864b = storyCommentItem.f352864b;
        this.f352865c = storyCommentItem.f352865c;
        this.f352866d = storyCommentItem.f352866d;
        this.f352867e = storyCommentItem.f352867e;
        this.f352868f = storyCommentItem.f352868f;
        this.f352869g = storyCommentItem.f352869g;
        this.f352870h = storyCommentItem.f352870h;
        this.f352871i = storyCommentItem.f352871i;
        this.f352872j = storyCommentItem.f352872j;
        this.f352873k = storyCommentItem.f352873k;
        this.f352874l = storyCommentItem.f352874l;
    }
}
