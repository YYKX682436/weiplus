package mm3;

/* loaded from: classes10.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f411205d;

    public r(mm3.w wVar) {
        this.f411205d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.lang.Object obj;
        mm3.w wVar = this.f411205d;
        yz5.l lVar = wVar.f411213q;
        java.util.Iterator it = wVar.f411211o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fm3.b) obj).f345561a, wVar.f411210n)) {
                    break;
                }
            }
        }
        lVar.mo146xb9724478(obj);
        wVar.dismiss();
    }
}
