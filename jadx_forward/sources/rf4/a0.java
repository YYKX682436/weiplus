package rf4;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5, android.content.Context context) {
        super(2);
        this.f476550d = c18481x2b6a00e5;
        this.f476551e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        gf4.a comment = (gf4.a) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476550d;
        yz5.p commentReplyCallback = c18481x2b6a00e5.getCommentReplyCallback();
        if (commentReplyCallback != null) {
            commentReplyCallback.mo149xb9724478(comment, java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            c18481x2b6a00e5.m71420x7a40225b(true);
            android.view.View view = c18481x2b6a00e5.f253478r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18481x2b6a00e5.f253471h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f476551e, com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
        }
        return jz5.f0.f384359a;
    }
}
