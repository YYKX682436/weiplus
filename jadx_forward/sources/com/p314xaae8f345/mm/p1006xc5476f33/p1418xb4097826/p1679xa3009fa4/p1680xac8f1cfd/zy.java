package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class zy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz f218258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe f218259e;

    public zy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe c15380x99018fe) {
        this.f218258d = izVar;
        this.f218259e = c15380x99018fe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iz izVar = this.f218258d;
        if (izVar.f216307g.size() > 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe springBackLayout = this.f218259e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(springBackLayout, "$springBackLayout");
            hc2.f1.d(springBackLayout);
            izVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.app.Activity context = izVar.m80379x76847179();
            java.lang.String promptWording = izVar.f216311n;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = izVar.f216310m;
            int i17 = izVar.f216309i;
            i0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promptWording, "promptWording");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15017xbc9187d6.class);
            intent.putExtra("key_continue_prompt", promptWording);
            intent.putExtra("key_continue_lastbuf", gVar != null ? gVar.f273689a : null);
            intent.putExtra("key_continue_flag", i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContinueWatchUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderContinueWatchUI", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
