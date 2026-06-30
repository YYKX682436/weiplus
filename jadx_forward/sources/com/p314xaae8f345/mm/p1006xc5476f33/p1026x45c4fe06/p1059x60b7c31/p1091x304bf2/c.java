package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* loaded from: classes7.dex */
public class c implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult f162789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58 f162790b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58 c12139x16510f58, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult openGameDetailResult) {
        this.f162790b = c12139x16510f58;
        this.f162789a = openGameDetailResult;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult openGameDetailResult = this.f162789a;
        openGameDetailResult.f162781d = true;
        this.f162790b.m50420x7b736e5c(openGameDetailResult);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult openGameDetailResult = this.f162789a;
        openGameDetailResult.f162781d = false;
        openGameDetailResult.f162782e = "";
        openGameDetailResult.f162783f = "";
        if (map.containsKey("error")) {
            openGameDetailResult.f162782e = (java.lang.String) map.get("error");
        }
        if (map.containsKey("type")) {
            openGameDetailResult.f162783f = (java.lang.String) map.get("type");
        }
        this.f162790b.m50420x7b736e5c(openGameDetailResult);
    }
}
