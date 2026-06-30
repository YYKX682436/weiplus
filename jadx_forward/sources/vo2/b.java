package vo2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo2.c f520090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vo2.c cVar) {
        super(1);
        this.f520090d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        vo2.c cVar = it instanceof vo2.c ? (vo2.c) it : null;
        vo2.c cVar2 = this.f520090d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar, cVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTPPlayer", "release " + cVar2.hashCode() + ' ' + b17);
        return java.lang.Boolean.valueOf(b17);
    }
}
