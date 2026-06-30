package ud2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.o f508160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ud2.o oVar) {
        super(1);
        this.f508160d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isAudioMode", java.lang.Boolean.valueOf(booleanValue));
        this.f508160d.e("audioModeChange", hashMap);
        return jz5.f0.f384359a;
    }
}
