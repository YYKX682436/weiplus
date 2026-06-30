package pv2;

/* loaded from: classes10.dex */
public abstract class i {
    public static final java.lang.String a(pv2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        return "stageName:" + (gVar instanceof tv2.p ? "FinderPostPrepareStage" : gVar instanceof tv2.f ? "FinderMediaProcessStage" : gVar instanceof tv2.v ? "FinderUploadStage" : gVar instanceof tv2.m ? "FinderPostCgiStage" : gVar instanceof tv2.o ? "FinderPostConfirmStage" : gVar instanceof rv2.b ? "PostFileClearStage" : gVar instanceof tv2.q ? "FinderSuccessStage" : gVar instanceof tv2.a ? "FinderFailedStage" : gVar instanceof tv2.x ? "FinderWaitStage" : gVar instanceof sv2.r ? "FinderDraftPrepareStage" : gVar instanceof sv2.m ? "FinderDraftMediaProcessStage" : gVar instanceof sv2.v ? "FinderDraftUploadStage" : gVar instanceof sv2.q ? "FinderDraftPostCgiStage" : gVar instanceof sv2.b ? "DraftSuccessStage" : gVar instanceof sv2.a ? "DraftFailedStage" : gVar instanceof sv2.c ? "DraftWaitStage" : gVar instanceof wv2.g ? "MvPostPrepareStage" : gVar instanceof wv2.c ? "MvMediaProcessStage" : gVar instanceof wv2.m ? "MvUploadStage" : gVar instanceof wv2.f ? "MvPostCgiStage" : gVar.getClass().getSimpleName()) + ", taskId:" + gVar.b() + ", taskType:" + gVar.a();
    }
}
