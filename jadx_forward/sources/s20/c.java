package s20;

/* loaded from: classes13.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s20.d f483805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s20.d dVar) {
        super(1);
        this.f483805d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            s20.d dVar = this.f483805d;
            s20.a aVar = dVar.f483808f;
            android.view.View view = dVar.f483807e;
            if (aVar != null) {
                f3.i iVar = new f3.i(view.getContext().getResources(), bitmap);
                int i17 = dVar.f483806d.f107490h;
                if (i17 == 1) {
                    iVar.c(i65.a.b(view.getContext(), r6.f107491i));
                } else if (i17 == 3) {
                    iVar.b(true);
                }
                aVar.f483795d = iVar;
                iVar.setBounds(0, 0, aVar.f483793b, aVar.f483794c);
            }
            view.postInvalidate();
        }
        return jz5.f0.f384359a;
    }
}
