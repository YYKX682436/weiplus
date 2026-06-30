package mm2;

/* loaded from: classes3.dex */
public final class w5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f411046f;

    /* renamed from: g, reason: collision with root package name */
    public int f411047g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f411048h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f411049i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f411050m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411046f = -1;
        this.f411047g = -1;
        this.f411048h = "";
        this.f411049i = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    public final void N6() {
        synchronized (this.f411049i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSEISeqSlice", "clearCurrentSEIInfo curMinSEISeq: " + this.f411046f + " curMaxSEISeq: " + this.f411047g + " size: " + this.f411049i.size());
            this.f411049i.clear();
        }
        this.f411046f = -1;
        this.f411047g = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSEISeqSlice", "set switch stream: false");
        this.f411050m = false;
    }

    public final java.lang.String O6(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("size: " + map.size() + ", [ ");
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append("seq: " + ((r45.l66) ((java.util.Map.Entry) it.next()).getValue()).m75942xfb822ef2(1) + ' ');
        }
        sb6.append(" ]");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        N6();
    }
}
