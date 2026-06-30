package android.support.v4.media.session;

/* loaded from: classes15.dex */
public interface f extends android.os.IInterface {
    boolean A6();

    void Bf(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

    void C8(boolean z17);

    void Cf(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

    void Gg();

    int H9();

    android.os.Bundle Jb();

    boolean K1();

    void Lf(java.lang.String str, android.os.Bundle bundle);

    void M4(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    android.support.v4.media.session.ParcelableVolumeInfo M9();

    boolean Mc(android.view.KeyEvent keyEvent);

    void O2(java.lang.String str, android.os.Bundle bundle);

    void P1(android.net.Uri uri, android.os.Bundle bundle);

    void S3(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle);

    void V2(java.lang.String str, android.os.Bundle bundle);

    void Vb(java.lang.String str, android.os.Bundle bundle);

    java.util.List Vh();

    void Xc(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i17);

    void Zb(android.net.Uri uri, android.os.Bundle bundle);

    void Zg(float f17);

    android.app.PendingIntent b2();

    void bi(int i17);

    void d6(android.support.v4.media.session.c cVar);

    int fb();

    android.os.Bundle getExtras();

    long getFlags();

    android.support.v4.media.MediaMetadataCompat getMetadata();

    java.lang.String getPackageName();

    java.lang.String getTag();

    void h5(boolean z17);

    void he(long j17);

    java.lang.CharSequence i7();

    void jh(int i17, int i18, java.lang.String str);

    void mf(android.support.v4.media.RatingCompat ratingCompat);

    void next();

    void pause();

    void pf(int i17, int i18, java.lang.String str);

    void play();

    void prepare();

    void previous();

    void r7(android.support.v4.media.session.c cVar);

    int rd();

    void re(int i17);

    void rewind();

    void seekTo(long j17);

    void stop();

    android.support.v4.media.session.PlaybackStateCompat t();

    void v4(int i17);

    void z1(java.lang.String str, android.os.Bundle bundle);

    boolean z4();
}
