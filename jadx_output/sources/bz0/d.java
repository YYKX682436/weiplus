package bz0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f36729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f36730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f36731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlinx.coroutines.r2 r2Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36730e = r2Var;
        this.f36731f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bz0.d(this.f36730e, this.f36731f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f36729d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f36730e;
            if (r2Var != null) {
                this.f36729d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct = bz0.f.f36737c;
        bz0.f fVar = bz0.f.f36735a;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = this.f36731f;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem;
                jSONObject = new org.json.JSONObject();
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker multiMediaVideoChecker = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a;
                java.lang.String str = galleryItem$VideoMediaItem.f138430e;
                kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                qc0.d1 b17 = multiMediaVideoChecker.b(str);
                if (b17 != null) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(b17.f361363a);
                    jSONArray2.put(b17.f361364b);
                    jSONObject.put("s", jSONArray2);
                    jSONObject.put("d", b17.f361366d);
                    jSONObject.put("f", java.lang.Float.valueOf(b17.f361365c));
                    jSONObject.put("vb", b17.f361367e);
                    jSONObject.put("ab", b17.f361370h);
                    jSONObject.put("as", b17.f361372j);
                    jSONObject.put("acc", b17.f361371i);
                    if (jSONObject.put("t", b17.f361369g ? "265" : "264") != null) {
                    }
                }
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                jSONArray3.put(galleryItem$VideoMediaItem.f138448z);
                jSONArray3.put(galleryItem$VideoMediaItem.f138447y);
                jSONObject.put("s", jSONArray3);
                jSONObject.put("d", galleryItem$VideoMediaItem.f138446x);
                jSONObject.put("f", galleryItem$VideoMediaItem.C);
                jSONObject.put("vb", galleryItem$VideoMediaItem.A);
            } else if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray4 = new org.json.JSONArray();
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem).f138430e);
                jSONArray4.put(n07 != null ? n07.outWidth : 0);
                jSONArray4.put(n07 != null ? n07.outHeight : 0);
                jSONObject2.put("s", jSONArray4);
                jSONObject = jSONObject2;
            } else {
                jSONObject = new org.json.JSONObject();
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONObject3 = new org.json.JSONObject().put("d", jSONArray).toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        maaSCreationReportStruct.f58931f = maaSCreationReportStruct.b("importMediaInfo", r26.i0.t(jSONObject3, ",", ";", false), true);
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct2 = bz0.f.f36737c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                arrayList.add(obj2);
            }
        }
        maaSCreationReportStruct2.f58933h = arrayList.size();
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct3 = bz0.f.f36737c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (obj3 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                arrayList2.add(obj3);
            }
        }
        maaSCreationReportStruct3.f58932g = arrayList2.size();
        com.tencent.mars.xlog.Log.i("MaasReport24946", "markInputMediaInfo: " + bz0.f.f36737c.f58931f);
        return jz5.f0.f302826a;
    }
}
