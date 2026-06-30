package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteEffects;", "", "", "url", "Lcom/tencent/kinda/gen/ITransmitKvData;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "effectStartLiteApp", "effectPublishStop", "effectOnLiteAppStopped", "effectOnLiteAppRunning", "effectOnLiteAppPaying", "effectOnLiteAppPaySucceed", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public interface KindaLiteEffects {
    void effectOnLiteAppPaySucceed();

    void effectOnLiteAppPaying();

    void effectOnLiteAppRunning();

    void effectOnLiteAppStopped();

    void effectPublishStop();

    void effectStartLiteApp(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);
}
