package rl5;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f478860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478861e;

    public m(rl5.r rVar, android.view.View view) {
        this.f478861e = rVar;
        this.f478860d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rl5.r rVar = this.f478861e;
        db5.q4 q4Var = rVar.f478886w;
        if (q4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z2) q4Var;
            android.content.Context context = z2Var.f219927a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String query = z2Var.f219928b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
            java.lang.String str = "https://search.weixin.qq.com/cgi-bin/newsearchweb/userclientjump?scene=3&path=page%2Fsearch%2Ffeedback&feedbackType=4&taskId=bfmVV8tHh7c9dPgSFL38kZ&tplId=B9deHvCoSNg4K7MWHPhFEb&clientType=2048&subType=4&query=" + java.net.URLEncoder.encode(query, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) + "&relatedWords=" + java.net.URLEncoder.encode(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c3.f219564b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        rVar.f478876n.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
