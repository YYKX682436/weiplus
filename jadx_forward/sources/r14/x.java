package r14;

/* loaded from: classes5.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f450165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r14.y yVar) {
        super(1);
        this.f450165d = yVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", it);
        j45.l.n(this.f450165d.f450166a, "sns", ".ui.SnsUploadUI", intent, 2);
        return jz5.f0.f384359a;
    }
}
