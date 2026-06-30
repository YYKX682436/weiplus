package ti3;

/* loaded from: classes9.dex */
public class j implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f501155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ti3.m f501156b;

    public j(android.content.Context context, ti3.m mVar) {
        this.f501155a = context;
        this.f501156b = mVar;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteTing() bitmap is null");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.ui.sk.a(ti3.i.n(this.f501155a, bitmap, width, height), true, com.p314xaae8f345.mm.ui.zk.a(r4, 3), false);
        ti3.m mVar = this.f501156b;
        mVar.f501162a.setImageBitmap(a17);
        ti3.i.p(mVar.f501162a);
    }
}
