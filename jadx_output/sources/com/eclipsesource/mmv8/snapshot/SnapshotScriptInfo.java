package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public final class SnapshotScriptInfo {
    public static final int INVALID_FD = -1;
    public final java.lang.String content;

    /* renamed from: fd, reason: collision with root package name */
    public final int f43997fd;
    public long length;
    public final java.lang.String name;
    public final long startOffset;

    public SnapshotScriptInfo(java.lang.String str, int i17, long j17, long j18) {
        if (!com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
            if (!com.eclipsesource.mmv8.snapshot.Utils.isInvalidFd(i17)) {
                this.name = str;
                this.f43997fd = i17;
                this.startOffset = j17;
                this.length = j18;
                this.content = null;
                return;
            }
            throw new java.lang.IllegalArgumentException("fd is illegal");
        }
        throw new java.lang.IllegalArgumentException("name is empty");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.name, ((com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo) obj).name);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.name);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnapshotScriptInfo{name='");
        sb6.append(this.name);
        sb6.append("', fd=");
        sb6.append(this.f43997fd);
        sb6.append(", startOffset=");
        sb6.append(this.startOffset);
        sb6.append(", length=");
        sb6.append(this.length);
        sb6.append(", content='");
        java.lang.String str = this.content;
        sb6.append(str != null ? str.substring(0, java.lang.Math.min(str.length(), 1024)) : null);
        sb6.append("'}");
        return sb6.toString();
    }

    public SnapshotScriptInfo(java.lang.String str, java.lang.String str2) {
        if (!com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
            if (!com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str2)) {
                this.name = str;
                this.f43997fd = -1;
                this.startOffset = 0L;
                this.length = 0L;
                this.content = str2;
                return;
            }
            throw new java.lang.IllegalArgumentException("content is empty");
        }
        throw new java.lang.IllegalArgumentException("name is empty");
    }
}
