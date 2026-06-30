package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3 f95883b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f95884a = new java.util.LinkedList();

    public static com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3 a() {
        if (f95883b == null) {
            synchronized (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3.class) {
                if (f95883b == null) {
                    f95883b = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c3();
                }
            }
        }
        return f95883b;
    }
}
