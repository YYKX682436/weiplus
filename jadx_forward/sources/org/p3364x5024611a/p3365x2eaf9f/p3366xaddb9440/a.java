package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* loaded from: classes7.dex */
public class a implements org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.i {

    /* renamed from: d, reason: collision with root package name */
    public org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h f429367d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f429368e;

    public a(byte[] bArr) {
        org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155047x37d04a = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155047x37d04a(bArr, 0, bArr.length);
        this.f429367d = m155047x37d04a;
        if (m155047x37d04a == null) {
            this.f429368e = true;
        } else {
            this.f429368e = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f429367d = null;
        this.f429368e = true;
    }
}
