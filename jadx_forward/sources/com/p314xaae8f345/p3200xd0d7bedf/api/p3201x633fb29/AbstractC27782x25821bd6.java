package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.BaseMessage */
/* loaded from: classes9.dex */
public abstract class AbstractC27782x25821bd6 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f301678a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f301679b;

    public static android.os.Bundle c(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6 abstractC27782x25821bd6) {
        if (abstractC27782x25821bd6 == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        abstractC27782x25821bd6.f(bundle);
        bundle.putString("_wwobject_identifier_", abstractC27782x25821bd6.getClass().getName());
        return bundle;
    }

    public void a(android.content.Intent intent, java.lang.String str) {
    }

    public abstract boolean b();

    public void d(android.content.Context context) {
        this.f301678a = context;
    }

    public void e(java.lang.String str) {
        this.f301679b = str;
    }

    public abstract void f(android.os.Bundle bundle);
}
