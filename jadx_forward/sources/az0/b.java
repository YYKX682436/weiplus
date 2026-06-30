package az0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96870d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.b(this.f96870d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transcode file ");
        java.lang.String str = this.f96870d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.HeicTranscodeHelper", sb6.toString());
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(az0.c.f96905a);
        sb7.append('/');
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String str4 = str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getName(...)");
        java.lang.String str5 = (java.lang.String) kz5.n0.a0(r26.n0.f0(str4, new java.lang.String[]{"."}, false, 0, 6, null), 0);
        if (str5 == null) {
            str5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        sb7.append(str5);
        sb7.append("_transcoded.jpg");
        java.lang.String sb8 = sb7.toString();
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(sb8);
        java.lang.String str6 = a18.f294812f;
        if (str6 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.HeicTranscodeHelper", str + " has cache " + sb8);
            return sb8;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "start transcode for file " + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.Bitmap t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(str, 4096, 4096, true, false);
        if (t17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.HeicTranscodeHelper", "decode bitmap error " + str);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "decode success, start encode " + str + ", takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(t17, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb8, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.HeicTranscodeHelper", "encode success " + str + ", takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(sb8);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            obj2 = m143895xf1229813;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Maas.HeicTranscodeHelper", m143898xd4a2fc34, "save bitmap error " + str, new java.lang.Object[0]);
        }
        return (java.lang.String) obj2;
    }
}
