package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 f284440d;

    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601) {
        this.f284440d = c21894x47dd8601;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAvatarImageView", "revokeTv onClick!!");
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601.f284352p;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = this.f284440d;
        pp3.b bVar = c21894x47dd8601.f234427h;
        if (bVar != null) {
            pp3.j jVar = (pp3.j) bVar;
            op3.c cVar = jVar.f439017c;
            if (cVar == null || cVar.f428791e == null) {
                z17 = false;
            } else {
                mp3.j jVar2 = (mp3.j) i95.n0.c(mp3.j.class);
                op3.c cVar2 = jVar.f439017c;
                ((lp3.l) jVar2).Di(cVar2.f428791e, 3, cVar2.f428789c);
                android.content.Context context = ((android.view.View) jVar.f439015a).getContext();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bre);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                e4Var.c();
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAvatarImageView", "onClick RevokePat succeed!!");
                c21894x47dd8601.f234428i.dismiss();
                ((pp3.j) c21894x47dd8601.f234427h).a();
                ((pp3.j) c21894x47dd8601.f234427h).b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
