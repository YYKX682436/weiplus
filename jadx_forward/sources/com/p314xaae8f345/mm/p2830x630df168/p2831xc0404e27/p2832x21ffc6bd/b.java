package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d f296451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar) {
        super(0);
        this.f296451d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yq5.f fVar = this.f296451d.f296462e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(((yq5.b) fVar).f546122a);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
        try {
            int m7343x245ab229 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(D).m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 0);
            vz5.b.a(D, null);
            return new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e(m7343x245ab229);
        } finally {
        }
    }
}
