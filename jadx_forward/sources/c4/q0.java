package c4;

/* loaded from: classes15.dex */
public final class q0 extends c4.r0 {
    public q0(java.lang.String str, int i17, int i18) {
        super(str, i17, i18);
        new android.media.session.MediaSessionManager.RemoteUserInfo(str, i17, i18);
    }

    public q0(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}
