package kp3;

/* loaded from: classes14.dex */
public final class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 f392501d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16780x4fcabb82 activityC16780x4fcabb82) {
        this.f392501d = activityC16780x4fcabb82;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        dialog.dismiss();
        jp3.g gVar = jp3.g.f382533a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f392501d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        gVar.i(mo55332x76847179, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54070x4810c209, "ERR_PALM_CAMERA_PERSSION_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
    }
}
