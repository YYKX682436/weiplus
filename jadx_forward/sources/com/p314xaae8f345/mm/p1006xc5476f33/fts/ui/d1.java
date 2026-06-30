package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219571d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219571d = abstractActivityC15595x3a75f78;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219571d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = abstractActivityC15595x3a75f78.mo55332x76847179();
        java.lang.String query = abstractActivityC15595x3a75f78.b7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        java.lang.String str = "https://search.weixin.qq.com/cgi-bin/newsearchweb/userclientjump?scene=3&path=page%2Fsearch%2Ffeedback&feedbackType=4&taskId=bfmVV8tHh7c9dPgSFL38kZ&tplId=B9deHvCoSNg4K7MWHPhFEb&clientType=2048&subType=4&query=" + java.net.URLEncoder.encode(query, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) + "&relatedWords=" + java.net.URLEncoder.encode(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c3.f219564b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
