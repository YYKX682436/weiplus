package com.p314xaae8f345.p2841xd11c237d.mm;

/* renamed from: com.tencent.paymars.mm.ConnectRecordSerializer */
/* loaded from: classes12.dex */
public class C23015xc753cdad {
    /* renamed from: deserialize */
    public static com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[] m84285x6820db7f(byte[] bArr) {
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(bArr));
        com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[] c23014xe93729bbArr = (com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[]) objectInputStream.readObject();
        objectInputStream.close();
        return c23014xe93729bbArr;
    }

    /* renamed from: serialize */
    public static byte[] m84286xddd166e0(com.p314xaae8f345.p2841xd11c237d.mm.C23014xe93729bb[] c23014xe93729bbArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(c23014xe93729bbArr);
        objectOutputStream.flush();
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
