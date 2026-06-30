package al5;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.AlbumChooserView f5871e;

    public c(com.tencent.mm.ui.widget.AlbumChooserView albumChooserView, java.lang.String str) {
        this.f5871e = albumChooserView;
        this.f5870d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.AlbumChooserView albumChooserView = this.f5871e;
        albumChooserView.f211242f = false;
        albumChooserView.f211240d.setText(this.f5870d);
    }
}
