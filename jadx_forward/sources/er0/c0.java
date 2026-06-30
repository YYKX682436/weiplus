package er0;

/* loaded from: classes12.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f337483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.Map map, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c) {
        super(0);
        this.f337483d = map;
        this.f337484e = c10875xc0cf956c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        for (java.util.Map.Entry entry : this.f337483d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337484e;
            m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46717xffc941a4());
            java.lang.Integer num = c10875xc0cf956c.m46717xffc941a4().get(str);
            if (num == null) {
                num = 0;
            }
            m40827x8f8c4694.put(str, java.lang.Integer.valueOf(num.intValue() + intValue));
        }
        return jz5.f0.f384359a;
    }
}
