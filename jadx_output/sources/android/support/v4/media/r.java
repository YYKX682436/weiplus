package android.support.v4.media;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f8938a = new android.os.Bundle();

    public android.support.v4.media.MediaMetadataCompat a() {
        return new android.support.v4.media.MediaMetadataCompat(this.f8938a);
    }

    public android.support.v4.media.r b(java.lang.String str, android.graphics.Bitmap bitmap) {
        x.b bVar = android.support.v4.media.MediaMetadataCompat.f8915f;
        if (!bVar.containsKey(str) || ((java.lang.Integer) bVar.getOrDefault(str, null)).intValue() == 2) {
            this.f8938a.putParcelable(str, bitmap);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    public android.support.v4.media.r c(java.lang.String str, long j17) {
        x.b bVar = android.support.v4.media.MediaMetadataCompat.f8915f;
        if (!bVar.containsKey(str) || ((java.lang.Integer) bVar.getOrDefault(str, null)).intValue() == 0) {
            this.f8938a.putLong(str, j17);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    public android.support.v4.media.r d(java.lang.String str, java.lang.String str2) {
        x.b bVar = android.support.v4.media.MediaMetadataCompat.f8915f;
        if (!bVar.containsKey(str) || ((java.lang.Integer) bVar.getOrDefault(str, null)).intValue() == 1) {
            this.f8938a.putCharSequence(str, str2);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    public android.support.v4.media.r e(java.lang.String str, java.lang.CharSequence charSequence) {
        x.b bVar = android.support.v4.media.MediaMetadataCompat.f8915f;
        if (!bVar.containsKey(str) || ((java.lang.Integer) bVar.getOrDefault(str, null)).intValue() == 1) {
            this.f8938a.putCharSequence(str, charSequence);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
    }
}
