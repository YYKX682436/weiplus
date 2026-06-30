package sf2;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list) {
        super(1);
        this.f488643d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.z22 song = (r45.z22) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(song, "song");
        return java.lang.Boolean.valueOf(this.f488643d.contains(song.f473162f));
    }
}
