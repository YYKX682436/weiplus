package bb5;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.applet.SecurityImage f19138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f19139e;

    public i(com.tencent.mm.ui.applet.SecurityImage securityImage, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f19138d = securityImage;
        this.f19139e = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f19138d.getClass();
        this.f19139e.onClick(dialogInterface, i17);
    }
}
