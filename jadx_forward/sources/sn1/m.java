package sn1;

/* loaded from: classes12.dex */
public final class m implements o45.wg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o45.zg f491587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f491588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f491589c;

    public m(o45.zg zgVar, byte[] bArr, boolean z17) {
        this.f491587a = zgVar;
        this.f491588b = bArr;
        this.f491589c = z17;
    }

    @Override // o45.wg
    public boolean a(com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, boolean z17, int i19, int i27) {
        byte[] bArr4;
        int i28 = 0;
        if (i17 != 1000) {
            return false;
        }
        o45.zg zgVar = this.f491587a;
        o45.pi m150614x960aaed8 = zgVar.m150614x960aaed8();
        byte[] bArr5 = this.f491588b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSingleSession=");
        boolean z18 = this.f491589c;
        sb6.append(z18);
        sb6.append(", authKey=");
        sb6.append(android.util.Base64.encodeToString(bArr5, 2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Backup.BackupCgiHelper", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Backup.BackupCgiHelper", "dksession jType %d session should not null", java.lang.Integer.valueOf(i17));
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(zgVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp.Req");
        byte[] mo13852xc3d7db06 = ((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).mo13852xc3d7db06();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo13852xc3d7db06, "toProtoBuf(...)");
        int m75985x85b26348 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(mo13852xc3d7db06)) ? 0 : com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75985x85b26348(((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).m150617xb5887524(), bArr3, mo13852xc3d7db06);
        if (z18) {
            bArr4 = mo13852xc3d7db06;
        } else {
            byte[] m46287x830f760b = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46287x830f760b(bArr5, mo13852xc3d7db06);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m46287x830f760b, "AesGcmEncryptWithCompress(...)");
            bArr4 = m46287x830f760b;
            i28 = 13;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Backup.BackupCgiHelper", "start to encode, aesType=" + i28 + ", signature=" + m75985x85b26348);
        java.lang.String m150608xbdf72767 = ((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).m150608xbdf72767();
        int m150617xb5887524 = ((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).m150617xb5887524();
        int i29 = ((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).f152218b;
        int i37 = m150614x960aaed8.f424532c;
        java.lang.String str = m150614x960aaed8.f424530a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getKeye(...)");
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = str.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String str2 = m150614x960aaed8.f424531b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getKeyn(...)");
        byte[] bytes2 = str2.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        return com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75988x346219(bArr4, c19764x527bffc1, bArr5, i28, bArr2, m150608xbdf72767, m150617xb5887524, i29, i37, bytes, bytes2, m75985x85b26348, i19, ((com.p314xaae8f345.mm.p944x882e457a.m) zgVar).m150613x966afe1(), 0, 0, 0, 0);
    }
}
