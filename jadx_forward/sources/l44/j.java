package l44;

/* loaded from: classes.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397719e;

    public j(android.content.Context context, java.lang.String str) {
        this.f397718d = context;
        this.f397719e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f397718d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        } else {
            db5.t7.h(context, this.f397719e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        }
    }
}
