package com.p314xaae8f345.p542x3306d5.mm;

/* renamed from: com.tencent.mars.mm.ConnectRecordSerializer */
/* loaded from: classes12.dex */
public class C4565xc753cdad {
    /* renamed from: deserialize */
    public static com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m40181x6820db7f(byte[] bArr) {
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(bArr));
        com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] c4564xe93729bbArr = (com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[]) objectInputStream.readObject();
        objectInputStream.close();
        return c4564xe93729bbArr;
    }

    /* renamed from: serialize */
    public static byte[] m40182xddd166e0(com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] c4564xe93729bbArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(c4564xe93729bbArr);
        objectOutputStream.flush();
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
