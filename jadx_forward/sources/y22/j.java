package y22;

/* loaded from: classes.dex */
public final class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 f540628d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4) {
        this.f540628d = activityC13388xb8f672d4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        dialog.dismiss();
        this.f540628d.finish();
    }
}
