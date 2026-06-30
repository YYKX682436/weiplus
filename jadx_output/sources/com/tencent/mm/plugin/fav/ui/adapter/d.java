package com.tencent.mm.plugin.fav.ui.adapter;

/* loaded from: classes11.dex */
public class d implements w82.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.adapter.e f100494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.adapter.f f100495b;

    public d(com.tencent.mm.plugin.fav.ui.adapter.f fVar, com.tencent.mm.plugin.fav.ui.adapter.e eVar) {
        this.f100495b = fVar;
        this.f100494a = eVar;
    }

    @Override // w82.m0
    public void a(java.lang.String str, java.lang.String str2) {
        this.f100494a.f100496a.v(str, str2);
        w82.m0 m0Var = this.f100495b.f100502i;
        if (m0Var != null) {
            m0Var.a(str, str2);
        }
    }

    @Override // w82.m0
    public void b(java.lang.String str) {
        w82.m0 m0Var = this.f100495b.f100502i;
        if (m0Var != null) {
            m0Var.b(str);
        }
    }
}
